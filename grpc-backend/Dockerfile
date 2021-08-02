FROM openjdk:8u232

ARG SBT_VERSION=1.4.9

# Install sbt
RUN \
  mkdir /working/ && \
  cd /working/ && \
  curl -L -o sbt-$SBT_VERSION.deb https://repo.scala-sbt.org/scalasbt/debian/sbt-$SBT_VERSION.deb && \
  dpkg -i sbt-$SBT_VERSION.deb && \
  rm sbt-$SBT_VERSION.deb && \
  apt-get update && \
  apt-get install sbt && \
  cd && \
  rm -r /working/ && \
  sbt sbtVersion

RUN mkdir -p /root/project
ADD build.sbt /root
ADD ./project/plugins.sbt /root/project
COPY ./src /root/src
RUN cd /root && sbt compile

EXPOSE 9090
WORKDIR /root

CMD sbt run "runMain hello.HelloServer"
