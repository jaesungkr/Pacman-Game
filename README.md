# Pacman Game

A JavaFX maze game with keyboard movement, collectible cookies, moving ghosts, a score counter, and three lives.

## Controls

| Key | Action |
|---|---|
| Arrow keys | Move while the key is held |
| Escape | Restart after game over |

Collect cookies while avoiding ghosts. A collision removes a life and subtracts points.

## Project structure

- [Main.java](code/Main.java): JavaFX entry point (`code.Main`).
- [GameManager.java](code/GameManager.java): input handling, animation, scoring, and game state.
- [Maze.java](code/Maze.java) and [BarObstacle.java](code/BarObstacle.java): maze layout and collision geometry.
- [Ghost.java](code/Ghost.java): ghost movement.
- [Pacman.java](code/Pacman.java), [Cookie.java](code/Cookie.java), and [Score.java](code/Score.java): player, collectibles, and score display.

## Open the project

Use a Java IDE with a compatible JDK and JavaFX SDK configured. Import the repository, preserve the `code` package structure, and run `code.Main`.

The repository does not include a Maven or Gradle build or a pinned JavaFX version. `Main.java` constructs the scene directly; the included FXML file is not its active entry point.

## Scope

A small JavaFX game project retained as a development example, not a packaged game release.
