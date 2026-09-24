# My Gym API

A RESTful API for managing gym routines, built with Spring Boot and PostgreSQL.

## Tech Stack

- **Java 21**
- **Spring Boot 4.1.1** (Web MVC, Data JPA, Validation, Security)
- **PostgreSQL**
- **Maven**

## Prerequisites

- Java 21+
- PostgreSQL running locally
- Maven (or use the included `./mvnw` wrapper)

## Getting Started

1. **Clone the repo**

   ```bash
   git clone <repo-url>
   cd my-gym-api
   ```

2. **Configure the database**

   Create `src/main/resources/application-local.properties` with your DB credentials:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/my_gym_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Run the app**

   ```bash
   ./mvnw spring-boot:run
   ```

   The API starts on `http://localhost:8080`.

## API Endpoints

### Routines

| Method | Endpoint               | Description          |
|--------|------------------------|----------------------|
| GET    | `/api/routines`        | Get all routines     |
| GET    | `/api/routines/{id}`   | Get routine by ID    |

## Data Models

### User

| Field          | Type            |
|----------------|-----------------|
| id             | UUID            |
| email          | String (unique) |
| password_hash  | String          |
| created_at     | OffsetDateTime  |

### Routine

| Field      | Type           |
|------------|----------------|
| id         | UUID           |
| user_id    | UUID           |
| name       | String         |
| is_active  | Boolean        |
| created_at | OffsetDateTime |

## Running Tests

```bash
./mvnw test
```
