package stepdefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class TaskHooks {
//    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    @Before("@task")
    //sadece @task tag i ile etiketli featurelardan önce çalışır. -task list - task update - task delete testleri
    public void setup() throws IOException {
        System.out.println("tasks have been created");

        //task create et

//        // one instance, reuse
//
//        TaskHooks obj = new TaskHooks();
//
//        try {
//            System.out.println("Testing 1 - Send Http GET request");
//            obj.sendGet();
//
//            System.out.println("Testing 2 - Send Http POST request");
//            obj.sendPost();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            obj.close();
//        }

    }

    private void close() throws IOException {
//        httpClient.close();
    }

    private void sendPost() throws Exception {
//
//        HttpPost post = new HttpPost("https://httpbin.org/post");
//
//        // add request parameter, form parameters
//        List<NameValuePair> urlParameters = new ArrayList<>();
//        urlParameters.add(new BasicNameValuePair("username", "abc"));
//        urlParameters.add(new BasicNameValuePair("password", "123"));
//        urlParameters.add(new BasicNameValuePair("custom", "secret"));
//
//        post.setEntity(new UrlEncodedFormEntity(urlParameters));
//
//        try (CloseableHttpClient httpClient = HttpClients.createDefault();
//             CloseableHttpResponse response = httpClient.execute(post)) {
//
//            System.out.println(EntityUtils.toString(response.getEntity()));
//        }

    }

    private void sendGet() throws Exception {
//
//        HttpGet request = new HttpGet("https://www.google.com/search?q=mkyong");
//
//        // add request headers
//        request.addHeader("custom-key", "mkyong");
//        request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");
//
//        try (CloseableHttpResponse response = httpClient.execute(request)) {
//
//            // Get HttpResponse Status
//            System.out.println(response.getStatusLine().toString());
//
//            HttpEntity entity = response.getEntity();
//            Header headers = entity.getContentType();
//            System.out.println(headers);
//
//            if (entity != null) {
//                // return it as a String
//                String result = EntityUtils.toString(entity);
//                System.out.println(result);
//            }

//        }

    }

    @After("@task")
    public void tearDown() {
        System.out.println("tasks have been deleted");
        //delete tasks
    }


}
