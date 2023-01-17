package ua.hillel.homeTask_20;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONObject;
import ua.hillel.homeTask_20.entities.Store;

import java.io.IOException;

public class StoreController {
    public void returnByStatus(String status) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/inventory" + status)
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
        System.out.println(response.headers().toString());
    }
    public void placeNewOrder(String newOrder) throws IOException {
        JSONObject  jsonObject = new JSONObject();

        jsonObject.put ("id", 5);
        jsonObject.put("petId", 1601);
        jsonObject.put("quantity", 7);
        jsonObject.put("shipDate", "2023-01-16T21:12:48.341Z");
        jsonObject.put("status", "approved");
        jsonObject.put("complete", true);

        RequestBody body = RequestBody.create(jsonObject.toString(), MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();

        JSONObject responseObject = new JSONObject(response.body().string());

        System.out.println(response.code());
        System.out.printf("id=%d; petId=%d, quantity=%d, status=%s",
                responseObject.get("id"),
                responseObject.get("petId"),
                responseObject.get("quantity"),
                responseObject.get("status"));
        System.out.println(response.headers().toString());

    }
    public void placeNewOrderWithGSON(Store store) throws  IOException{
        Gson gson = new Gson();

        RequestBody body = RequestBody.create(gson.toJson(store), MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .build();
        Response response = new OkHttpClient().newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
        System.out.println(response.headers().toString());
    }
    public void findPurchaseById(int id) throws  IOException{
        Request request = new Request.Builder()
                .get()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + id)
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
        System.out.println(response.headers().toString());
    }

    public  void deleteOrderByID(int orderID) throws  IOException{
        Gson gson = new Gson();

        RequestBody body = RequestBody.create(gson.toJson(orderID), MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .delete(body)
                .url("https://petstore3.swagger.io/api/v3/store/order/5")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
        System.out.println(response.headers().toString());
    }
}
