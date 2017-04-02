package com.roisoftstudio.data.login;

import com.roisoftstudio.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryLoginRepository implements LoginRepository {

    private Map<String, User> emailUserMap = createUsers();

    @Override
    public User getUser(String email) {
        return emailUserMap.get(email);
    }

    private static Map<String, User> createUsers() {
        Map<String, User> emailUserMap = new HashMap<>();
        emailUserMap.put("moyfly@g.com", new User("1", "moyfly@g.com"));
        emailUserMap.put("roi@g.com", new User("2", "roi@g.com"));
        return emailUserMap;
    }
}
