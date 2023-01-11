package com.example.springbootwebservice.config.auth.dto;

import com.example.springbootwebservice.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

// User 클래스는 엔티티이기 때문에 언제 다른 엔티티와 관계가 형성될지 모른다.
// User 클래스에 직렬화 코드를 넣으면 자식 엔티티를 갖고 있을 경우 직렬화 대상에 자식들까지 포함되니 성능 이슈, 부수 효과가 발생할 확률이 높다.
// 따라서 직렬화 기능을 가진 세션 Dto를 추가로 만든다.
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }

}
