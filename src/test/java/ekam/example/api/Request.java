package ekam.example.api;

import java.util.List;
import lombok.Getter;

public @Getter
class Request{
	private String method;
	private List<Object> header;
	private String description;
	private Body body;
	private String url;
}