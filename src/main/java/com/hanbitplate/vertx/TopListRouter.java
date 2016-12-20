package com.hanbitplate.vertx;

import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

public class TopListRouter {
	
	public void defineRouters(Router router) {
		router.route("/api/toplists/:toplistId").handler(ctx -> {
			HttpServerRequest request = ctx.request();
			HttpServerResponse response = ctx.response();
			
			String toplistId = request.getParam("toplistId");
			
			response.putHeader("content-type", "application/json;charset=UTF-8");
			response.sendFile("json/toplist.id.json");
		});		
		
		router.route("/api/toplist/related").handler(ctx -> {
			HttpServerResponse response = ctx.response();
			
			
			response.putHeader("content-type", "application/json;charset=UTF-8");
			response.sendFile("json/toplist.related.json");
		});
		
		
		router.route("/api/toplist/keywords").handler(ctx -> {
			HttpServerResponse response = ctx.response();
			
			
			response.putHeader("content-type", "application/json;charset=UTF-8");
			response.sendFile("json/toplist.keywords.json");
		});
		
	}

}
