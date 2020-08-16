package com.youkeda.notebook.base.commonservice.entity.request;

import com.youkeda.notebook.base.commonservice.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.*;


/**
 * @author ly
 */
@SuppressWarnings("rawtypes")
public class RequestData extends HashMap implements Map
{

    private static final long serialVersionUID = 1L;
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    Map map = null;

    HttpServletRequest request;

    @SuppressWarnings("unchecked")
    public RequestData(HttpServletRequest request)
    {   
        try
        {
            this.request = request;
            Map properties = request.getParameterMap();
            Map returnMap = new HashMap();
            Iterator entries = properties.entrySet().iterator();
            Entry entry;
            String name = "";
            while (entries.hasNext())
            {
                String value = "";
                entry = (Entry)entries.next();
                name = (String)entry.getKey();
                Object valueObj = entry.getValue();
                if (null == valueObj)
                {
                    value = "";
                }
                else if (valueObj instanceof String[])
                {
                    String[] values = (String[])valueObj;
                    for (int i = 0; i < values.length; i++ )
                    {
                        value += values[i] + ",";
                    }
                    value = value.substring(0, value.length() - 1);
                }
                else
                {
                    value = valueObj.toString();
                }
                returnMap.put(name, value);
            }
            map = returnMap;
        }
        catch (Exception e)
        {
            logger.error(e.getMessage());
            throw new ServiceException("paramsError", -100000, "页面请求参数不正确,请前台检查");
        }
    }

    //
    public RequestData()
    {
        map = new HashMap();
    }

    //
    @Override
    public Object get(Object key)
    {
        Object obj = null;
        if (map.get(key) instanceof Object[])
        {
            Object[] arr = (Object[])map.get(key);
            obj = request == null ? arr : (request.getParameter(
                (String)key) == null ? arr : arr[0]);
        }
        else
        {
            obj = map.get(key);
        }
        return obj;
    }

    //
    public String getString(Object key)
    {
        return (String)get(key);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object put(Object key, Object value)
    {
        return map.put(key, value);
    }

    @Override
    public Object remove(Object key)
    {
        return map.remove(key);
    }

    public void clear()
    {
        map.clear();
    }

    public boolean containsKey(Object key)
    {
        // TODO Auto-generated method stub
        return map.containsKey(key);
    }

    public boolean containsValue(Object value)
    {
        // TODO Auto-generated method stub
        return map.containsValue(value);
    }

    public Set entrySet()
    {
        // TODO Auto-generated method stub
        return map.entrySet();
    }

    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return map.isEmpty();
    }

    public Set keySet()
    {
        // TODO Auto-generated method stub
        return map.keySet();
    }

    @SuppressWarnings("unchecked")
    public void putAll(Map t)
    {
        // TODO Auto-generated method stub
        map.putAll(t);
    }

    public int size()
    {
        // TODO Auto-generated method stub
        return map.size();
    }

    public Collection values()
    {
        // TODO Auto-generated method stub
        return map.values();
    }

}
