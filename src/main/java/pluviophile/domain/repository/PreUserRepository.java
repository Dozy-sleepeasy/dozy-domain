package pluviophile.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pluviophile.domain.domain.PreUser;


@Repository
public interface PreUserRepository extends JpaRepository<PreUser,Long> {

}
