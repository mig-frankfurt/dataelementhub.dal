# Changelog DataElementHub Data Access Layer
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [3.0.0] - 2022-07-12
### Removed
- Resourcemanager and MigrationUtil
- flyway and slf4j dependencies

## [2.4.1] - 2022-07-06
### Fixed
- Remove "on update" part of trigger to check for duplicate identifiers since it prevented releasing elements

## [2.4.0] - 2022-07-05
### Removed
- Status "STAGED"

## [2.3.0] - 2022-07-01
### Added
- unique constraint for value domain scoped identifiers
### Changed
- update to latest parent.pom (set java version to 17)
- updated libs

## [2.2.0] - 2022-03-07
### Security
- Update postgresql to 42.3.3

## [2.1.0] - 2022-01-26
### Added
- Import process_status enum
### Changed
- Staging and import tables are expanded to contain more details

## [2.0.0] - 2021-12-03
### Changed
- user_namespace_grants is now user_namespace_access
- grant_type is now access_level_type

## [1.0.0] - 2021-09-24
### Added
- initial commit
