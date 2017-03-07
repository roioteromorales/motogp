package com.roisoftstudio.infrastructure.usecase;

import com.roisoftstudio.infrastructure.threading.Executor;

import java.util.function.Consumer;

import static com.google.common.base.Preconditions.checkNotNull;

public abstract class UseCase<Response> {

    private Consumer<Response> successCallback;
    private Consumer<Exception> errorCallback;
    private Executor executor;

    public UseCase(Executor executor) {
        this.executor = executor;
    }

    public UseCase<Response> onSuccess(Consumer<Response> successCallback) {
        this.successCallback = successCallback;
        return this;
    }

    public UseCase<Response> onError(Consumer<Exception> errorCallback) {
        this.errorCallback = errorCallback;
        return this;
    }

    public void run() {
        checkNotNull(successCallback, "successCallback can't be null. Use onSuccess(successCallback)");
        checkNotNull(errorCallback, "errorCallback can't be null. Use onError(errorCallback)");

        executor.accept(() -> {
            try {
                onRun();
            } catch (RuntimeException e) {
//                Timber.e(e, "Unhandled error while executing <%s> with parameters <%s>", getClass().getName(), parameters);
                notifyError(e);
            }
        });
    }

    protected void notifySuccess(Response response) {
        executor.accept(() -> successCallback.accept(response));
    }

    protected void notifyError(Exception error) {
        executor.accept(() -> errorCallback.accept(error));
    }

    protected abstract void onRun();

}
