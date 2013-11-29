package easy2sms;

import java.net.URI;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

class HttpPatchWithBody extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "PATCH";
    public String getMethod() { return METHOD_NAME; }

    public HttpPatchWithBody(final String uri) {
        super();
        setURI(URI.create(uri));
    }
    public HttpPatchWithBody(final URI uri) {
        super();
        setURI(uri);
    }
    public HttpPatchWithBody() { super(); }
}
