package pluviophile.domain.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pluviophile.domain.domain.PreUser;
import pluviophile.domain.dto.PreUserRequest;
import pluviophile.domain.repository.PreUserRepository;

@Service
@Transactional
public class PreUserService {
    private final PreUserRepository preUserRepository;

    @Autowired
    public PreUserService(PreUserRepository preUserRepository){
        this.preUserRepository = preUserRepository;
    }

    @Transactional
    public void createPreUser(PreUserRequest preUserRequest) {
        PreUser user = PreUser.builder()
                .type(preUserRequest.getType())
                .phoneNum(preUserRequest.getPhoneNum())
                .build();
        preUserRepository.save(user);
    }
}
