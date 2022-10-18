package org.generation.MyFirstWebApp.service;

import org.generation.MyFirstWebApp.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceMap
    implements UserService
{
    final Map<Integer, User> userMap = new HashMap<>();

    @Override
    public List<User> getAll()
    {
        
        return null;
    }

    @Override
    public void add( User user )
    {
        
    }

    @Override
    public void remove( User user )
    {
        
    }

    @Override
    public int size()
    {
        
        return 0;
    }

    @Override
    public User getUser( int position )
    {
        
        return null;
    }
}
