import React, { useState } from 'react'
import { Link } from 'react-router-dom'
import FavImg from '../img/5a02bfca18e87004f1ca4395.png'
import NoFavImg from '../img/Heart-PNG-Images-HD.png'
export default function Producto({producto, agregarAFavoritos, eliminarDeFavoritos}) {
  const[favorito, setFavorito] = useState(false)

  function handleClick(){
    if(favorito){
        eliminarDeFavoritos(producto)
        setFavorito(false)
    }else{
        agregarAFavoritos(producto)
        setFavorito(true)
    }
  }

  return (
    <div className='producto'>
        <Link to={`/producto/${producto.id}`}><img src={producto.image} alt=''/></Link>
        <div className='info'>
            <p>{producto.title}</p>
            <mark>${producto.price}</mark>
        </div>

        {!favorito ?
            <img className='fav-icon' src={FavImg} onClick={handleClick}/>
            :
            <img className='fav-icon' src={NoFavImg} onClick={handleClick}/>
        }
    </div>
  )
}
