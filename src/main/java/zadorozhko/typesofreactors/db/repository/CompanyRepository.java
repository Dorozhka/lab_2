package zadorozhko.typesofreactors.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zadorozhko.typesofreactors.db.entity.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
