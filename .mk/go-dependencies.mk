GO_SDK_DEPENDENCIES ?=

.PHONY: update_go_sdk_dependencies
update_go_sdk_dependencies: generate_go
	@test -n "$(strip $(GO_SDK_DEPENDENCIES))" || \
		(echo "GO_SDK_DEPENDENCIES must list module@version arguments"; exit 1)
	cd sdk && go get $(GO_SDK_DEPENDENCIES)
	cd sdk && go mod tidy
