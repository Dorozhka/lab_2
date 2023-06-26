package zadorozhko.typesofreactors.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zadorozhko.typesofreactors.db.entity.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
}
