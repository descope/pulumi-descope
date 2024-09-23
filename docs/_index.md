---
title: Descope
meta_desc: Provides an overview of the Descope Provider for Pulumi.
layout: package
---

The `Descope` provider for Pulumi can be used to provision any of the resources available with `Descope`.

## Example

{{< chooser language "javascript,typescript,python" >}}

{{% choosable language javascript %}}

```javascript
import * as descope from "@descope/pulumi-descope";

export const project = new descope.Project("descope-project", {});
```

{{% /choosable %}}

{{% choosable language typescript %}}

```typescript
import * as descope from "@descope/pulumi-descope";

export const project = new descope.Project("descope-project", {});
```

{{% /choosable %}}
{{% choosable language python %}}

```python
import descope_pulumi

project = descope_pulumi.Project("descope-project")
```

{{% /choosable %}}

{{< /chooser >}}
