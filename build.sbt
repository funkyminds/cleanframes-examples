scalaVersion := "2.12.8"
name := "cleanframes-examples"
organization := "io.funkyminds"
version := "1.0-SNAPSHOT"
libraryDependencies ++= {
  val sparkVersion = "2.4.3"

  Seq(
    // @formatter:off
    "io.funkyminds"     %% "cleanframes"          % {sparkVersion + "_0.3.0-SNAPSHOT"},
    "org.apache.spark"  %% "spark-core"           % sparkVersion                         % Provided,
    "org.apache.spark"  %% "spark-sql"            % sparkVersion                         % Provided,
    "org.apache.spark"  %% "spark-hive"           % sparkVersion                         % Provided,
    "com.holdenkarau"   %% "spark-testing-base"   % {sparkVersion + "_0.12.0"}           % Test,
    "org.scalatest"     %% "scalatest"            % "3.0.5"                              % Test
    // @formatter:om
   )
}