/**
 * Created by Andrew Bell 7/12/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.dsbot.dao;

import com.recursivechaos.dsbot.domain.MessageLinks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageLinksDao extends MongoRepository<MessageLinks, String> {

}
