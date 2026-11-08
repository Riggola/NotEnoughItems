# Recipe search: exact item names

Source: [GTNewHorizons/NotEnoughItems](https://github.com/GTNewHorizons/NotEnoughItems),
based on tag `2.8.171-GTNH` (commit `030795e`).

This change is limited to the **recipe window** search filter:

- `"steel ingot"` matches the complete displayed item name `Steel Ingot` only.
- `steel ingot` preserves the existing partial matching behavior.
- `>"steel ingot"` restricts the match to recipe outputs; `<"steel ingot"` to inputs.
- The quoted exact-name behavior works in the default search mode as well as Extended+.
- The regular NEI item search at the bottom of the inventory is unchanged.

The Filter Syntax tooltip includes an exact-name example. The change is implemented
independently of any specific addon or recipe map.

## Build

Use the normal GTNH NEI build environment and run `./gradlew build`. This source
snapshot includes a regression test in `SearchTokenParserTest.java`.

**Verification:** Java syntax parsing passed. Gradle tests could not run in the
preparation environment because downloading the Gradle distribution was blocked;
the code still needs a full build and in-game test on GTNH 2.9.0.
