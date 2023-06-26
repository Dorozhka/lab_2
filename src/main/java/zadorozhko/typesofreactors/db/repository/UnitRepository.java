package zadorozhko.typesofreactors.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zadorozhko.typesofreactors.db.entity.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {
}
