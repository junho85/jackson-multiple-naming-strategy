package kr.pe.junho85.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.pe.junho85.demo.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {
    final ObjectMapper objectMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(objectMapper.readValue("{\"user_id\":\"jackson\"}", User.class));
        System.out.println(objectMapper.readValue("{\"userId\":\"jackson\"}", User.class));
    }
}
