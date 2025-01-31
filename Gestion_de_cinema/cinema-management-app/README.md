# Cinema Management Application

## Description
This project is a Java-based application designed to manage a cinema hall. It allows users to manage cinema halls, films, screenings, and ticket reservations through a user-friendly graphical interface.

## Project Structure
The project is organized as follows:

```
cinema-management-app
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── cinema
│   │   │   │       ├── App.java
│   │   │   │       ├── gui
│   │   │   │       │   └── MainFrame.java
│   │   │   │       ├── models
│   │   │   │       │   ├── CinemaHall.java
│   │   │   │       │   ├── Film.java
│   │   │   │       │   ├── Screening.java
│   │   │   │       │   └── Ticket.java
│   │   │   │       ├── services
│   │   │   │       │   ├── CinemaHallService.java
│   │   │   │       │   ├── FilmService.java
│   │   │   │       │   ├── ScreeningService.java
│   │   │   │       │   └── TicketService.java
│   │   │   │       └── utils
│   │   │   │           └── DatabaseUtil.java
│   │   └── resources
│   │       └── application.properties
├── .gitignore
├── build.gradle
└── README.md
```

## Features
- **Manage Cinema Halls**: Add, update, and retrieve information about cinema halls.
- **Manage Films**: Add, update, and retrieve film details including title, duration, genre, and version.
- **Manage Screenings**: Schedule and retrieve information about film screenings.
- **Manage Tickets**: Book and retrieve ticket information.

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd cinema-management-app
   ```
3. Build the project using Gradle:
   ```
   ./gradlew build
   ```
4. Run the application:
   ```
   ./gradlew run
   ```

## Usage
Upon launching the application, users will be presented with a main interface that allows them to navigate through the various functionalities for managing cinema operations.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.