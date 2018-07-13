# JPA

## New Project

Use the [Spring Initializr](https://start.spring.io/) to create a new `Gradle Project` with `Java` and `Spring Boot 2.0.3`.

Name the group and artifact appropriately, like:
* Group: `com.wecancodeit.PROJECTNAME`
* Artifact: `PROJECTNAME`

Add these dependencies:
* Web
* Thymeleaf
* JPA
* H2
* DevTools

Download the .zip file and unzip the folder inside to `~/wcci/code`.

In Git Bash, `cd` into the directory and run `gradle eclipse`.

In Eclipse, import the project.

There is a test already provided in `src/test/java` to make sure the Spring container is configured correctly. Run it to make sure.

## Creating a JPA Test Class

Create a new class in `src/test/java` and name it appropriately. Include these annotations:
```java
@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
```

Inject the `TestEntityManager` as a resource:
```java
@Resource
private TestEntityManager entityManager;
```

> This is the LITERAL name of the EntityManager. It is a built-in class that always has this exact name.

## Testing Entities

> In the examples below, `Entity` and `entity` should be replaced by the name of the actual entity with which you are working.

Inject any repository you are using as a resource:
```java
@Resource
private EntityRepository entityRepo;
```

Annotate the test:
```java
@Test
public void shouldSaveAndLoadEntity() {
  // ...
}
```

Create the object and save it to the database:
```java
// Pass in any appropriate constructor arguments
// Here we give the entity a name, which we can test for later
Entity entity = entityRepo.save(new Entity("entityName"));
```

Now that it is saved as a database record, it has an ID. Get that ID so we can query the database for it later:
```java
long entityId = entity.getId();
```

Clear out JPA's cache. We do this so we KNOW we are getting data from the database and not from JPA's memory. This has two steps: `flush` and `clear`.

Think of JPA as Microsoft Word. When you open a file, that file exists in memory (where you are working with it) and on the disk (where it is saved). To make sure that our changes are persisted, we need to do two things:
* Save the open Word file (`flush`)
* Close Microsoft Word (`clear`)
This ensures that when we open Word again, the file we see is the one that was saved to the disk.

Here's the code:
```java
entityManager.flush();
entityManager.clear();
```

Finally, we need to query the database for our saved entity. We will use the ID from earlier:
```java
Optional<Entity> result = entityRepo.findById(entityId);
savedEntity = result.get();
assertThat(savedEntity.getName(), is("entityName"));
```

## Defining Entities


## Testing Entity Relationships

## Defining Entity Relationships

## Seeding / Populating Data

## Using the H2 Console

## Testing Controllers

## Wiring Controllers / Exposing JPA Data to a Thymeleaf Template

## Creating a Thymeleaf Template / Consuming JPA Data in a Thymeleaf Template

## 