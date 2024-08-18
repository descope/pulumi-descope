"""A Python Pulumi program"""

import pulumi
import descope_pulumi

project = descope_pulumi.Project("pulumi-py-test")

pulumi.export("project", project)