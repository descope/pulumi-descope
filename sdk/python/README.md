# Descope Resource Provider

The Descope Resource Provider lets you manage [Descope](https://www.descope.com) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @descope/pulumi-descope
```

or `yarn`:

```bash
yarn add @descope/pulumi-descope
```

### Python

To use from Python, install using `pip`:

```bash
pip install descope_pulumi
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/descope/pulumi-descope/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Descope.Pulumi.Descope
```

## Configuration

The following configuration points are available for the `descope` provider:

- `descope:projectId` (environment: `DESCOPE_PROJECT_ID`) - Descope Project ID
- `descope:managementKey` (environment: `DESCOPE_MANAGEMENT_KEY`) - Descope Management Key

## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/descope/api-docs/).
