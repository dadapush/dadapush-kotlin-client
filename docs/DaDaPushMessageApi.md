# DaDaPushMessageApi

All URIs are relative to *https://www.dadapush.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessage**](DaDaPushMessageApi.md#createMessage) | **POST** /api/v1/message | push Message to a Channel
[**deleteMessage**](DaDaPushMessageApi.md#deleteMessage) | **DELETE** /api/v1/message/{messageId} | delete a Channel Message
[**getMessage**](DaDaPushMessageApi.md#getMessage) | **GET** /api/v1/message/{messageId} | get a Channel Message
[**getMessages**](DaDaPushMessageApi.md#getMessages) | **GET** /api/v1/messages | get Message List


<a name="createMessage"></a>
# **createMessage**
> ResultOfMessagePushResponse createMessage(body, xMinusChannelMinusToken)

push Message to a Channel

&lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;1 request per 1s&lt;/li&gt;&lt;li&gt;30 request per 1m&lt;/li&gt;&lt;li&gt;500 request per 1h&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;

### Example
```kotlin
// Import classes:
//import com.dadapush.client.infrastructure.*
//import com.dadapush.client.models.*

val apiInstance = DaDaPushMessageApi()
val body : MessagePushRequest =  // MessagePushRequest | body
val xMinusChannelMinusToken : kotlin.String = xMinusChannelMinusToken_example // kotlin.String | see: https://www.dadapush.com/channel/list
try {
    val result : ResultOfMessagePushResponse = apiInstance.createMessage(body, xMinusChannelMinusToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DaDaPushMessageApi#createMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DaDaPushMessageApi#createMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessagePushRequest**](MessagePushRequest.md)| body |
 **xMinusChannelMinusToken** | **kotlin.String**| see: https://www.dadapush.com/channel/list | [optional]

### Return type

[**ResultOfMessagePushResponse**](ResultOfMessagePushResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMessage"></a>
# **deleteMessage**
> Result deleteMessage(messageId, xMinusChannelMinusToken)

delete a Channel Message

&lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;10 request per 1s&lt;/li&gt;&lt;li&gt;100 request per 1m&lt;/li&gt;&lt;li&gt;1000 request per 1h&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;

### Example
```kotlin
// Import classes:
//import com.dadapush.client.infrastructure.*
//import com.dadapush.client.models.*

val apiInstance = DaDaPushMessageApi()
val messageId : kotlin.Long = 789 // kotlin.Long | messageId
val xMinusChannelMinusToken : kotlin.String = xMinusChannelMinusToken_example // kotlin.String | see: https://www.dadapush.com/channel/list
try {
    val result : Result = apiInstance.deleteMessage(messageId, xMinusChannelMinusToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DaDaPushMessageApi#deleteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DaDaPushMessageApi#deleteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Long**| messageId |
 **xMinusChannelMinusToken** | **kotlin.String**| see: https://www.dadapush.com/channel/list | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessage"></a>
# **getMessage**
> ResultOfMessageObject getMessage(messageId, xMinusChannelMinusToken)

get a Channel Message

&lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;10 request per 1s&lt;/li&gt;&lt;li&gt;100 request per 1m&lt;/li&gt;&lt;li&gt;1000 request per 1h&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;

### Example
```kotlin
// Import classes:
//import com.dadapush.client.infrastructure.*
//import com.dadapush.client.models.*

val apiInstance = DaDaPushMessageApi()
val messageId : kotlin.Long = 789 // kotlin.Long | messageId
val xMinusChannelMinusToken : kotlin.String = xMinusChannelMinusToken_example // kotlin.String | see: https://www.dadapush.com/channel/list
try {
    val result : ResultOfMessageObject = apiInstance.getMessage(messageId, xMinusChannelMinusToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DaDaPushMessageApi#getMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DaDaPushMessageApi#getMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **kotlin.Long**| messageId |
 **xMinusChannelMinusToken** | **kotlin.String**| see: https://www.dadapush.com/channel/list | [optional]

### Return type

[**ResultOfMessageObject**](ResultOfMessageObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMessages"></a>
# **getMessages**
> ResultOfPageResponseOfMessageObject getMessages(page, pageSize, xMinusChannelMinusToken)

get Message List

&lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;1 request per 1s&lt;/li&gt;&lt;li&gt;45 request per 1m&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;

### Example
```kotlin
// Import classes:
//import com.dadapush.client.infrastructure.*
//import com.dadapush.client.models.*

val apiInstance = DaDaPushMessageApi()
val page : kotlin.Int = 1 // kotlin.Int | greater than 1
val pageSize : kotlin.Int = 10 // kotlin.Int | range is 1,50
val xMinusChannelMinusToken : kotlin.String = xMinusChannelMinusToken_example // kotlin.String | see: https://www.dadapush.com/channel/list
try {
    val result : ResultOfPageResponseOfMessageObject = apiInstance.getMessages(page, pageSize, xMinusChannelMinusToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DaDaPushMessageApi#getMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DaDaPushMessageApi#getMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| greater than 1 | [default to 1]
 **pageSize** | **kotlin.Int**| range is 1,50 | [default to 10]
 **xMinusChannelMinusToken** | **kotlin.String**| see: https://www.dadapush.com/channel/list | [optional]

### Return type

[**ResultOfPageResponseOfMessageObject**](ResultOfPageResponseOfMessageObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

