package zadorozhko.typesofreactors.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zadorozhko.typesofreactors.db.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
