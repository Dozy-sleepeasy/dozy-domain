package pluviophile.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pluviophile.domain.domain.PreUser;

import java.util.Optional;


@Repository
public interface PreUserRepository extends JpaRepository<PreUser,Long> {

    @Override
    Optional<PreUser> findById(Long aLong);

    Optional<PreUser> findByPhoneNum(String phoneNum);
}
