
import "./Header.css"
import Icono from "../../public/Civa.avif"
const header = () => {
  return (
    <div className="main-header">
      <div className="title-header">
        <div className="logociva">
          <img src={Icono} alt="" />
        </div>
        <div className="title">PROYECTO BUSES</div>
        <div className="author">
          Autor: Mijael Duart Yauyo Granados          
        </div>
      </div>
    </div>
  )
}

export default header
