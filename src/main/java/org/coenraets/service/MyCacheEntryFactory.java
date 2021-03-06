package org.coenraets.service;

import net.sf.ehcache.constructs.blocking.CacheEntryFactory;

/**
 * @author : Mathilde Lemee
 */
public class MyCacheEntryFactory implements CacheEntryFactory {
  public WineMysql wineMysql = new WineMysql();


  @Override
  public Object createEntry(final Object key) throws Exception {
    System.out.println("ENTRY FACTORY"+key.toString());
    return wineMysql.findById((Long)key);
  }
}
