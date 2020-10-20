package com.hbhb.cw.systemcenter.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaokang
 * @since 2020-10-19
 */
public interface MailApi {

    @PostMapping("/post")
    void postMail(@RequestParam String receiver, @RequestParam String title, @RequestParam String content);
}
