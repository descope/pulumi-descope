# Release Process

This repository uses [release-please](https://github.com/googleapis/release-please) to automate releases based on [Conventional Commits](https://www.conventionalcommits.org/).

## How It Works

1. **Commits**: When you merge commits to the `main` branch using conventional commit messages (e.g., `feat:`, `fix:`), release-please tracks these changes.

2. **Release PR**: The release-please workflow automatically creates or updates a release PR that:
   - Bumps the version based on the types of commits (following semantic versioning)
   - Generates a changelog from commit messages
   - Updates the release manifest

3. **Triggering a Release**: When you merge the release PR, release-please:
   - Creates a new Git tag (e.g., `v0.3.5`)
   - This tag triggers the existing `release.yml` workflow managed by ci-mgmt
   - The `release.yml` workflow builds and publishes the provider and SDKs

## Commit Message Format

Use conventional commit messages to control versioning:

- `feat:` - New feature (bumps minor version, e.g., 0.3.4 → 0.4.0)
- `fix:` - Bug fix (bumps patch version, e.g., 0.3.4 → 0.3.5)
- `feat!:` or `BREAKING CHANGE:` - Breaking change (bumps major version, e.g., 0.3.4 → 1.0.0)
- `docs:`, `chore:`, `style:`, `refactor:`, `test:`, `build:`, `ci:` - No version bump (included in changelog)

Examples:
```
feat(auth): add OIDC support
fix(grpc): handle connection timeout
docs: update installation guide
```

## Configuration Files

- `.github/workflows/release-please.yml` - The release-please workflow (custom, not managed by ci-mgmt)
- `.github/release-please-config.json` - Configuration for release-please
- `.github/.release-please-manifest.json` - Tracks the current version

## Important Notes

- The `release-please.yml` workflow is a **custom workflow** and is NOT managed by pulumi/ci-mgmt
- It does not replace any existing workflows
- The actual release and publishing is still handled by the existing `release.yml` workflow
- The ci-mgmt regeneration process should not override this custom workflow as it has a unique name
