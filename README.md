# com.dadapush.client - Kotlin client library for DaDaPush Public API

## Requires

* Kotlin 1.3.31
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://www.dadapush.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DaDaPushMessageApi* | [**createMessage**](docs/DaDaPushMessageApi.md#createmessage) | **POST** /api/v1/message | push Message to a Channel
*DaDaPushMessageApi* | [**deleteMessage**](docs/DaDaPushMessageApi.md#deletemessage) | **DELETE** /api/v1/message/{messageId} | delete a Channel Message
*DaDaPushMessageApi* | [**getMessage**](docs/DaDaPushMessageApi.md#getmessage) | **GET** /api/v1/message/{messageId} | get a Channel Message
*DaDaPushMessageApi* | [**getMessages**](docs/DaDaPushMessageApi.md#getmessages) | **GET** /api/v1/messages | get Message List


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.dadapush.client.models.Action](docs/Action.md)
 - [com.dadapush.client.models.MessageObject](docs/MessageObject.md)
 - [com.dadapush.client.models.MessagePushRequest](docs/MessagePushRequest.md)
 - [com.dadapush.client.models.MessagePushResponse](docs/MessagePushResponse.md)
 - [com.dadapush.client.models.PageResponseOfMessageObject](docs/PageResponseOfMessageObject.md)
 - [com.dadapush.client.models.Result](docs/Result.md)
 - [com.dadapush.client.models.ResultOfMessageObject](docs/ResultOfMessageObject.md)
 - [com.dadapush.client.models.ResultOfMessagePushResponse](docs/ResultOfMessagePushResponse.md)
 - [com.dadapush.client.models.ResultOfPageResponseOfMessageObject](docs/ResultOfPageResponseOfMessageObject.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
