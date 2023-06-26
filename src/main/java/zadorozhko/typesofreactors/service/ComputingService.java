package zadorozhko.typesofreactors.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collection;
import zadorozhko.typesofreactors.db.entity.Company;
import zadorozhko.typesofreactors.db.entity.Country;
import zadorozhko.typesofreactors.db.entity.Region;
import zadorozhko.typesofreactors.db.entity.Site;
import zadorozhko.typesofreactors.db.entity.Unit;
import zadorozhko.typesofreactors.db.repository.CompanyRepository;
import zadorozhko.typesofreactors.db.repository.CountryRepository;
import zadorozhko.typesofreactors.db.repository.RegionRepository;
import zadorozhko.typesofreactors.db.repository.SiteRepository;
import zadorozhko.typesofreactors.db.repository.UnitRepository;

@Service
@RequiredArgsConstructor
public class ComputingService {
    private final CompanyRepository companyRepository;
    private final CountryRepository countryRepository;
    private final RegionRepository regionRepository;
    private final SiteRepository siteRepository;
    private final UnitRepository unitRepository;

    public Collection<Unit> createUnits(Collection<Unit> units) {
        return unitRepository.saveAll(units);
    }

    public Collection<Region> createRegions(Collection<Region> regions) {
        return regionRepository.saveAll(regions);
    }

    public Collection<Country> createCountries(Collection<Country> countries) {
        return countryRepository.saveAll(countries);
    }

    public Collection<Site> createSites(Collection<Site> sites) {
        return siteRepository.saveAll(sites);
    }

    public Collection<Company> createCompanies(Collection<Company> companies) {
        return companyRepository.saveAll(companies);
    }
}
