
- to update to latest version of longevity, update the following line in `build.sbt`:
  - `scriptedLaunchOpts += "-Dlongevity.version=0.27.0"`
- to run the tests
  - `sbt scripted`
  - note that success often looks like failure, because a lot of the tests are testing failure
    scenarios. to see if it actually succeeds, the very last line of output should start with
    `[success]`.
  - run `+scripted` to test both SBT versions we target
- to publish:
  - up version in build to `x.y.0`
  - `sbt reload`
  - `sbt ^publishSigned`
  - follow steps on Sonatype
  - `git tag -s -a x.y.0 -m "create tag x.y.0"`
  - up version in build to `x.y+1-SNAPSHOT`
  
  
