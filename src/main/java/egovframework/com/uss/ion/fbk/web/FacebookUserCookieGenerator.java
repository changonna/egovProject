/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Utility class for managing the quick_start user cookie that remembers the signed-in user.
 * @author Keith Donald
 *
 */
package egovframework.com.uss.ion.fbk.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.util.CookieGenerator;

/**
 * facebook Cookie관리 클래스
 * @author 표준프레임워크센터
 * @since 2014.11.10
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일     	수정자          		      수정내용
 *  -----------    --------------------    ---------------------------
 *  2014.11.10		표준프레임워크센터		      최초 생성
 *  </pre>
 */

final class FacebookUserCookieGenerator {

	private final CookieGenerator userCookieGenerator = new CookieGenerator();

	public FacebookUserCookieGenerator() {
		userCookieGenerator.setCookieName("social_user");
	}

	public void addCookie(String userId, HttpServletResponse response) {
		userCookieGenerator.addCookie(response, userId);
	}

	public void removeCookie(HttpServletResponse response) {
		userCookieGenerator.addCookie(response, "");
	}

	public String readCookieValue(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return null;
		}
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(userCookieGenerator.getCookieName())) {
				return cookie.getValue();
			}
		}
		return null;
	}

}
