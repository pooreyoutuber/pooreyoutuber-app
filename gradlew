#!/usr/bin/env sh

##############################################################################
# Gradle start up script for UN*X
##############################################################################

DIR="$( cd "$( dirname "$0" )" && pwd )"
APP_BASE_NAME=$(basename "$0")
APP_HOME=$DIR

DEFAULT_JVM_OPTS=""

exec java $DEFAULT_JVM_OPTS -cp "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
