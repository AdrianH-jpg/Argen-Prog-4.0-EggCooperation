
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import Productos from './components/Productos'
import useProducto from './hooks/useProducto'
import Detalle from './components/Detalle'

function App() {
const {productos, favoritos, agregarAFavoritos, eliminarDeFavoritos} = useProducto()
  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path='/' element={<Productos productos={productos} agregarAFavoritos={agregarAFavoritos} eliminarDeFavoritos={eliminarDeFavoritos}/>}/>
        <Route path='/favoritos' element={<Productos productos={favoritos} agregarAFavoritos={agregarAFavoritos} eliminarDeFavoritos={eliminarDeFavoritos}/>}/>
        <Route path='/producto/:id' element={<Detalle/>}/>
      </Routes>
      <Footer />
    </BrowserRouter>
  )
}

export default App
