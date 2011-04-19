/*
 * Copyright (c) 2002-2010, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.digglike.business;

import fr.paris.lutece.portal.service.plugin.Plugin;

import java.util.List;


/**
 *
 *Interface IVoteTypeDAO
 *
 */
public interface ICategoryDAO
{
    /**
     * Insert a new record in the table.
     *
     * @param category instance of the Category object to insert
     * @param plugin the plugin
     */
    void insert( Category category, Plugin plugin );

    /**
     * update record in the table.
     *
     * @param category instance of the Category object to update
     * @param plugin the plugin
     */
    void store( Category category, Plugin plugin );

    /**
     * Delete a record from the table
     *
     * @param  nIdCategory The identifier of the category
     * @param plugin the plugin
     */
    void delete( int nIdCategory, Plugin plugin );

    /**
     * Load the data of the category from the table
     *
     * @param idKey The identifier of the category
     * @param plugin the plugin
     * @return The category
     */
    Category load( int idKey, Plugin plugin );

    /**
     * Load the data of all category returns them in a  list
     * @param plugin the plugin
     * @return  the list of category
     */
    List<Category> select( Plugin plugin );

    /**
    * true if there is a  digg associate to the category
    * @param nIdCategory the key of the category
    * @param plugin the plugin
    * @return true if there is a digg associate to the category
    */
    boolean isAssociateToDigg( int nIdCategory, Plugin plugin );
}