/**
* DaDaPush Public API
* DaDaPush: Real-time Notifications App Send real-time notifications through our API without coding and maintaining your own app for iOS or Android devices.
*
* The version of the OpenAPI document: v1
* Contact: contacts@dadapush.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.dadapush.client.apis

import com.dadapush.client.infrastructure.*
import com.dadapush.client.models.*

class DaDaPushMessageApi(basePath: kotlin.String = "https://www.dadapush.com") : ApiClient(basePath) {

    /**
    * push Message to a Channel
    * &lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;1 request per 1s&lt;/li&gt;&lt;li&gt;30 request per 1m&lt;/li&gt;&lt;li&gt;500 request per 1h&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;
    * @param body body
     * @param channelToken see: https://www.dadapush.com/channel/list (optional)
    * @return ResultOfMessagePushResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun createMessage(body: MessagePushRequest, channelToken: kotlin.String?): ResultOfMessagePushResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-channel-token" to channelToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/v1/message",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ResultOfMessagePushResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResultOfMessagePushResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * delete a Channel Message
    * &lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;10 request per 1s&lt;/li&gt;&lt;li&gt;100 request per 1m&lt;/li&gt;&lt;li&gt;1000 request per 1h&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;
    * @param messageId messageId
     * @param channelToken see: https://www.dadapush.com/channel/list (optional)
    * @return Result
    */
    @Suppress("UNCHECKED_CAST")
    fun deleteMessage(messageId: kotlin.Long, channelToken: kotlin.String?): Result {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-channel-token" to channelToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/v1/message/{messageId}".replace("{"+"messageId"+"}", "$messageId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Result>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Result
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * get a Channel Message
    * &lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;10 request per 1s&lt;/li&gt;&lt;li&gt;100 request per 1m&lt;/li&gt;&lt;li&gt;1000 request per 1h&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;
    * @param messageId messageId
     * @param channelToken see: https://www.dadapush.com/channel/list (optional)
    * @return ResultOfMessageObject
    */
    @Suppress("UNCHECKED_CAST")
    fun getMessage(messageId: kotlin.Long, channelToken: kotlin.String?): ResultOfMessageObject {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-channel-token" to channelToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/message/{messageId}".replace("{"+"messageId"+"}", "$messageId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ResultOfMessageObject>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResultOfMessageObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * get Message List
    * &lt;h2&gt;Rate Limit:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;1 request per 1s&lt;/li&gt;&lt;li&gt;45 request per 1m&lt;/li&gt;&lt;/ul&gt;&lt;h2&gt;Result code/errmsg List:&lt;/h2&gt;&lt;ul&gt;&lt;li&gt;0: ok&lt;/li&gt;&lt;li&gt;1: server error&lt;/li&gt;&lt;li&gt;101: channel is exists&lt;/li&gt;&lt;li&gt;102: channel is not exists&lt;/li&gt;&lt;li&gt;103: channel token error&lt;/li&gt;&lt;li&gt;104: channel is not exists&lt;/li&gt;&lt;li&gt;105: message is not exists&lt;/li&gt;&lt;li&gt;204: bad request&lt;/li&gt;&lt;li&gt;205: permission deny&lt;/li&gt;&lt;li&gt;206: too many request, please after 5 minutes to try!&lt;/li&gt;&lt;li&gt;301: duplicate username/email&lt;/li&gt;&lt;li&gt;302: user is not exists&lt;/li&gt;&lt;li&gt;303: user password is error&lt;/li&gt;&lt;li&gt;304: client push token is error&lt;/li&gt;&lt;li&gt;305: user is disabled&lt;/li&gt;&lt;li&gt;306: your subscription is expired&lt;/li&gt;&lt;li&gt;307: user not subscribe channel&lt;/li&gt;&lt;/ul&gt;
    * @param page greater than 1 
    * @param pageSize range is 1,50
     * @param channelToken see: https://www.dadapush.com/channel/list (optional)
    * @return ResultOfPageResponseOfMessageObject
    */
    @Suppress("UNCHECKED_CAST")
    fun getMessages(page: kotlin.Int, pageSize: kotlin.Int, channelToken: kotlin.String?): ResultOfPageResponseOfMessageObject {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"), "pageSize" to listOf("$pageSize"))
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-channel-token" to channelToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/v1/messages",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ResultOfPageResponseOfMessageObject>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResultOfPageResponseOfMessageObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }

}
