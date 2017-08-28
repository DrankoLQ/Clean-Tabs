# Clean-Tabs
App scaffolding based on Clean Architecture and TabLayout UI pattern

# Features
- A MainActivity that initializes two fragments (FirstFragment and SecondFragment)
- MainActivity handle both fragments using a ViewPager and TabLayout from Support Library
- Each Fragment is built upon a Clean Architecture: View - Presenter - Interactor - Repository
- Dagger 2 is used to inject both fragments into MainActivity
- ButterKnife is used to inject views from XML

# TODO list
- Dependency Injection via constructor to each dependecy for both fragments: presenters, interactors and repositories.
- Unit tests
