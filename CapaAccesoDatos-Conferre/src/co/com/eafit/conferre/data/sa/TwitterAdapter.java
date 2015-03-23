package co.com.eafit.conferre.data.sa;

import co.com.eafit.conferre.data.to.TweetTO;

public interface TwitterAdapter {
	public boolean tweet(TweetTO mensaje);
}
