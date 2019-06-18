FROM gocd/gocd-agent-ubuntu-18.04:v19.5.0

ENV BOOT_AS_ROOT=yes
ENV JAVA_HOME=/gocd-jre

RUN useradd goagent

RUN bash -c "cd /usr/local/bin && curl -fsSLo boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh && chmod 755 boot"

RUN ln -s /gocd-jre/bin/java /usr/local/bin/

