package com.dadapush.client.apis

import com.dadapush.client.models.Action
import com.dadapush.client.models.MessagePushRequest
import io.kotlintest.specs.StringSpec

internal class DaDaPushMessageApiTest : StringSpec(
        {

            "test create message" {
                var api = DaDaPushMessageApi()
                var channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
                val action = Action("view", Action.Type.link, "https://www.dadapush.com/")
                val body = MessagePushRequest(title = "Good News!",
                        content = "Good News! DaDaPush releasing new version",
                        needPush = true,
                        actions = arrayOf(action))
                val response = api.createMessage(body, channelToken)
                println(response)
//                response.code.shouldBe(0)
            }

            "test delete message" {
                var api = DaDaPushMessageApi()
                var channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
                var messageId = 227837L
                val response = api.deleteMessage(messageId, channelToken)
                println(response)
//                response.code.shouldBe(0)
            }

            "test get message" {
                var api = DaDaPushMessageApi()
                var channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
                var messageId = 227837L
                val response = api.getMessage(messageId, channelToken)
                println(response)
//                response.code.shouldBe(0)
            }

            "test get message list" {
                var api = DaDaPushMessageApi()
                var channelToken = "ctb3lwO6AeiZOwqZgp8BE8980FdNgp0cp6MCf"
                var page = 1
                var pageSize = 10
                val response = api.getMessages(page, pageSize, channelToken)
                println(response)
//                response.code.shouldBe(0)
            }
        }
)