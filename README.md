# Milanpetstoretest Java SDK 3.3.0

A Java SDK for Milanpetstoretest.

- API version: 3.3.0
- SDK version: 3.3.0

## Table of Contents

- [Requirements](#requirements)
- [Installation](#installation)
  - [Dependencies](#dependencies)
- [API Endpoint Services](#api-endpoint-services)
- [API Models](#api-models)
- [Testing](#testing)
- [Configuration](#configuration)
- [Sample Usage](#sample-usage)
- [License](#license)

## Requirements

- Java 8
- Maven

## Installation

If you use Maven, place the following within the <dependencies> tag in your pom.xml file:

```XML
<dependency>
  <groupId>io.github.mlanlazc</groupId>
  <artifactId>milanpetstoretest</artifactId>
  <version>0.0.1</version>
</dependency>
```

If you use Gradle, paste the next line inside the dependencies block of your build.gradle file:

```Gradle
implementation group: "io.github.mlanlazc", name: "Milanpetstoretest", version: "0.0.1"
```

## API Endpoint Services

All URIs are relative to https://example.com.

Click the service name for a full list of the service methods.

| Service                                                                        |
| :----------------------------------------------------------------------------- |
| [PetsService](src/main/java/io/github/mlanlazc/services/README.md#petsservice) |

## API Models

[A list documenting all API models for this SDK](src/main/java/io/github/mlanlazc//models/README.md#milanpetstoretest-models).

## Testing

Unit tests aren't available yet. When they are, you'll be able to run them with this command:

```Bash
mvn clean test
```

## Configuration

Your SDK may require some configuration changes.

## Sample Usage

```Java
package io.github.mlanlazc.examples;

import io.github.mlanlazc.exceptions.ApiException;
import io.github.mlanlazc.Milanpetstoretest;

public class Main {

  public static void main(String[] args) {
    Milanpetstoretest client = new Milanpetstoretest();
    try {
        Object response = client.petsService.listPets(2);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

Inside this directory is `examples/src/main/java/io/github/mlanlazc/examples/Main.java`. It's a simple, "hello, world" level program to demonstate this SDK. Run `install.sh` to prepare the SDK for use.

To see what other functions this SDK is capable of, look inside `src/main/java/io/github/mlanlazc/http/*Client.java`.

## License

License: MIT. See license in LICENSE.
