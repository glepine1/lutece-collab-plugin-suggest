/*
 * Copyright (c) 2002-2014, Mairie de Paris
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

import com.mysql.jdbc.PacketTooBigException;

import fr.paris.lutece.portal.service.plugin.Plugin;


/**
*
*Interface IVideoTypeDAO
*
*/
public interface IVideoTypeDAO
{
    /**
    * Load the data of the vote type from the table
    *
    * @param idKey The identifier of the vote type
    * @param plugin the plugin
     * @return the video
    */
    VideoType load( int idKey, Plugin plugin );

    /**
     * Insert a new record in the table.
     *
     * @param video instance of the VideoType object to insert
     * @param plugin the plugin
     * @return the id of the new video
     * @throws PacketTooBigException  exception
     */
    int insert( VideoType video, Plugin plugin ) throws PacketTooBigException;

    /**
         * Update the video in the table
         *
         * @param video instance of the VideoType object to update
         * @param plugin the plugin
         */
    void store( VideoType video, Plugin plugin );

    /**
         * Delete a record from the table
         *
         * @param nIdDiggSubmit The identifier of the DiggSubmit
         * @param plugin the plugin
         */
    void delete( int nIdDiggSubmit, Plugin plugin );
}
