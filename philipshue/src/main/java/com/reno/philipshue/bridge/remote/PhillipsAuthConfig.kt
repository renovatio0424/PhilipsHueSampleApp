package com.reno.philipshue.bridge.remote

private const val clientId = "R2FiYNNFweGXQL3iaNSLGAC6oCP0ZoxI"
private const val clientSecret = "fKwmbnPfMzi12ybv"
private const val appId = "huesampleapp"
private const val state = "testTest12"
private const val authBaseUrl = "https://api.meethue.com/"
private const val authPath = "oauth2/auth?clientid=$clientId&appid=$appId&state=$state&response_type=code"
const val authUrl = "$authBaseUrl$authPath"