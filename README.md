# AutomatizacionPragma

Repositorio de automatización de pruebas end-to-end, desarrollado como ejercicio/reto técnico. Contiene el proyecto **DemoBlaze-Test**, una suite de pruebas automatizadas para el sitio de comercio electrónico de demostración [demoblaze.com](https://www.demoblaze.com).

## 📋 Descripción

El proyecto automatiza flujos funcionales del sitio DemoBlaze utilizando **Serenity BDD** con el **Screenplay Pattern**, combinado con **Cucumber** (Gherkin) para la definición de escenarios y **Selenium WebDriver** para la interacción con el navegador. Las pruebas se ejecutan contra un **Selenium Grid** levantado con Docker Compose (nodos de Chrome y Firefox).

Los escenarios automatizados incluyen:

- **Creación de cuenta de usuario** (`user_create_account.feature`): registro de un nuevo usuario y validación del mensaje de bienvenida.
- **Login y compra** (`user_logged_and_buy.feature`):
  - Inicio de sesión y compra de un producto (celular) con confirmación del mensaje de pago.
  - Filtrado del catálogo por categoría (Laptops, Phones, Monitors).
  - Login y selección de un producto, validando que se muestre el botón "Add to cart".

## 🛠️ Tecnologías utilizadas

- **Java 11**
- **Gradle** (con wrapper incluido: `gradlew` / `gradlew.bat`)
- **Serenity BDD 4.0.1** (`serenity-core`, `serenity-junit`, `serenity-screenplay`, `serenity-screenplay-webdriver`, `serenity-cucumber`)
- **Cucumber** con runners JUnit 4
- **Selenium WebDriver** (`RemoteWebDriver`) sobre **Selenium Grid**
- **Docker / Docker Compose** para levantar el grid (`selenium/hub`, `selenium/node-chrome`, `selenium/node-firefox`)
- **JUnit 4** y **AssertJ** para aserciones
- **SLF4J / Logback** para logging
- Plugin de **SonarQube** para análisis de calidad de código

## 📁 Estructura del proyecto

```
AutomatizacionPragma/
└── DemoBlaze-Test/
    ├── build.gradle              # Dependencias y configuración de Serenity/Gradle
    ├── settings.gradle
    ├── serenity.properties
    ├── docker/
    │   └── docker-compose.yml    # Selenium Grid (hub + nodos Chrome/Firefox)
    ├── gradlew / gradlew.bat
    └── src/
        ├── main/java/com/pragma/demoblaze/
        │   ├── iteractions/       # Interactions del patrón Screenplay (OkButton, RefreshPage, Wait)
        │   ├── questions/         # Questions (ValidateLogin, ValidationPage, ValidationPay, VerifyCategory)
        │   ├── tasks/             # Tasks (BuyLaptop, BuyMonitor, BuyPhone, CreateUser, Pay, UserLogged)
        │   └── userinterfaces/    # Page Objects (DemoBlazeHome, DemoBlazeCart, DemoBlazeProduct, DemoBlazeProductPage)
        └── test/
            ├── java/com/pragma/demoblaze/
            │   ├── runners/           # Runners JUnit + Cucumber + Serenity (Chrome/Firefox)
            │   └── stepdefinitions/   # Step definitions y hooks (setup del Selenium Grid)
            └── resources/features/    # Escenarios en Gherkin (.feature)
```

El diseño sigue el **Screenplay Pattern** de Serenity BDD: un `Actor` (`User`) recibe habilidades (`BrowseTheWeb`) y ejecuta `Tasks` compuestas de `Interactions`, verificando el resultado con `Questions`, todo apoyado sobre Page Objects (`userinterfaces`).

## ▶️ Cómo ejecutar las pruebas

### Prerrequisitos

- JDK 11
- Docker y Docker Compose (para levantar el Selenium Grid)

### 1. Levantar el Selenium Grid

```bash
cd DemoBlaze-Test/docker
docker-compose up -d
```

Esto expone el hub en `http://localhost:4444`, que es la URL a la que se conectan los `RemoteWebDriver` configurados en el proyecto.

### 2. Ejecutar las pruebas

Desde la carpeta `DemoBlaze-Test/`:

```bash
./gradlew test
```

En Windows:

```bash
gradlew.bat test
```

El proyecto incluye runners específicos por navegador y por feature:

- `UserCreationChromeRun` / `UserCreationFirefoxRun` → escenario de creación de cuenta.
- `UserLoggedBuyPayChromeRun` / `UserLoggedBuyPayFirefoxRun` → escenario de login y compra (tag `@buyPhone`).

### 3. Consultar el reporte

Tras la ejecución, Serenity BDD genera un reporte HTML en:

```
DemoBlaze-Test/target/site/serenity/index.html
```

## 🌐 Sitio bajo prueba

Las pruebas se ejecutan contra el sitio público de demostración [https://www.demoblaze.com](https://www.demoblaze.com), utilizado como caso práctico para el ejercicio de automatización.
