package pluviophile.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pluviophile.domain.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByusername(String username);
}
