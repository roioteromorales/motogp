package com.roisoftstudio.data.login;

import com.roisoftstudio.domain.model.User;

public interface LoginRepository {

    User getUser(String email);
}
