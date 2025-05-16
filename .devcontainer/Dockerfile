FROM jetpackio/devbox:latest@sha256:3d164648f5ca0fa66cd080ee7c895af54e0a3ec19e19b232a2fea21628e82cfb

# Installing your devbox project
WORKDIR /code
COPY devbox.json devbox.json
COPY devbox.lock devbox.lock
RUN sudo chown -R "${DEVBOX_USER}:${DEVBOX_USER}" /code


RUN devbox run -- echo "Installed Packages."

RUN devbox shellenv --init-hook >> ~/.profile
